package com.elksa.design.patterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.elksa.design.patterns.patterns.behavioral.command.structural.Command;
import com.elksa.design.patterns.patterns.behavioral.command.structural.ConcreteCommand;
import com.elksa.design.patterns.patterns.behavioral.command.structural.Invoker;
import com.elksa.design.patterns.patterns.behavioral.command.structural.Receiver;
import com.elksa.design.patterns.patterns.behavioral.memento.real.ProspectMemory;
import com.elksa.design.patterns.patterns.behavioral.memento.real.SalesProspect;
import com.elksa.design.patterns.patterns.behavioral.memento.structural.Caretaker;
import com.elksa.design.patterns.patterns.behavioral.memento.structural.Memento;
import com.elksa.design.patterns.patterns.behavioral.memento.structural.Originator;
import com.elksa.design.patterns.patterns.behavioral.template_method.AbstractClass;
import com.elksa.design.patterns.patterns.behavioral.template_method.ConcreteClassA;
import com.elksa.design.patterns.patterns.structural.facade.structural.FacadeStructural;
import com.elksa.design.patterns.patterns.structural.proxy.structural.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Facade
        FacadeStructural facadeStructural = new FacadeStructural();

        String resultFromA = facadeStructural.getValueA();
        String resultFromB = facadeStructural.getValueB();
        String resultFromC = facadeStructural.getValueC();
        String result1 = facadeStructural.complexMethod1();
        String result2 = facadeStructural.complexMethod2();

        TextView txtFacade = findViewById(R.id.txt_facade);
        txtFacade.setText(resultFromA.concat(
                resultFromB.concat(resultFromC.concat(result1).concat(result2))));

        // Template method
        TextView txtTemplateMethod = findViewById(R.id.txt_template_method);
        AbstractClass ac = new ConcreteClassA();
        txtTemplateMethod.setText(ac.templateMethod());

        // Proxy
        TextView txtProxy = findViewById(R.id.txt_proxy);
        Proxy proxy = new Proxy();
        txtProxy.setText(proxy.request());

        // Command
        TextView txtCommand = findViewById(R.id.txt_command);
        // Create receiver, command, and invoker
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        // Set and execute command
        invoker.setCommand(command);
        txtCommand.setText(invoker.executeCommand());

        // Memento
        Originator originator = new Originator("State 1");
        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(originator.createMemento());
        originator.setState("State 2");
        caretaker.storeMemento(originator.createMemento());
        originator.setState("State 3");
        caretaker.storeMemento(originator.createMemento());

        StringBuilder mementos = new StringBuilder();
        Memento memento;
        do {
            memento = caretaker.getPreviousMemento();
            if (memento != null) {
                originator.restoreMemento(memento);
                mementos.append(originator.getState()).append("\n");
            }
        }
        while (memento != null);
        TextView txtMemento = findViewById(R.id.txt_memento);
        txtMemento.setText(mementos.toString());

        // Memento real world example
        SalesProspect s = new SalesProspect();
        s.setName("Noel van Halen");
        s.setPhone("(412) 256-0990");
        s.setBudget(25000.0F);

        // Store internal state

        ProspectMemory m = new ProspectMemory();
        m.setMemento(s.createMemento());

        // Continue changing originator

        s.setName("Leo Welch");
        s.setPhone("(310) 209-7111");
        s.setBudget(1000000.0F);

        // Restore saved state
        s.restoreState(m.getMemento());
    }
}
