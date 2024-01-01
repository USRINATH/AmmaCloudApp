package com.sri.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest {


    public static void main(String[] args) {

        ArrayList<Emp> ae=new ArrayList<Emp>();

        Emp e2=new Emp();
        e2.eid=1;
        e2.ename="Sri";
        e2.esal=100.0;
        ae.add(e2);

        for(int i=0;i<10;i++){

            //ArrayList<Emp> ae1=new ArrayList<Emp>();
            Emp e1=new Emp();
            e1.eid=i;
            e1.ename="Sri"+i;
            e1.esal=100.0+i;
            ae.add(e1);

        }
       // System.out.println("List"+ae);


        List<Emp> le=ae.stream().map(e->new Emp(e.eid,e.ename+"A",e.esal)).toList();

        Consumer<Emp> con=(con1)->{System.out.println(con1.ename+con1.eid+con1.esal);};




       // Supplier<Emp> sp=()->ae.get(1);

        //le.stream().filter(k->k.esal>100).forEach((con1)->System.out.println(con1.ename+con1.eid+con1.esal));
       // System.out.println(sp.);
        //ae.stream().filter()

 //     Set<Map.Entry<Integer,List<Emp>>> e=

           List<Emp> o=   le.stream().filter(k-> e2.ename.equals("Sri3")).collect(Collectors.groupingBy(m->m.eid)).entrySet().
                      stream().map(l->l.getValue().stream().reduce((f1,f2)->new Emp(f1.eid,f1.ename,f1.getEsal()+f2.getEsal()))).map(f->f.get()).collect(Collectors.toList());

           o.stream().forEach(k-> System.out.println("---"+k.getEname()));

//      e.forEach(k->System.out.println(k.getKey()));


    }
}
