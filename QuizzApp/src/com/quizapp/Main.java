package com.quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();

    }
}class Quiz{
        Scanner sc=new Scanner(System.in);
        int correctAnscount=0;
        int wrongAnscount=0;
        public void logic(){
            Questions q1=new Questions("1. Who invented Java Programming?", "a) Guido van Rossum", "b) James Gosling", "c) Dennis Ritchie","d) Bjarne Stroustrup");
            Questions q2=new Questions("2. Which statement is true about Java?","a) Java is a sequence-dependent programming language","b) Java is a code dependent programming language","c) Java is a platform-dependent programming language","d) Java is a platform-independent programming language");
            Questions q3=new Questions("3. Which component is used to compile, debug and execute the java programs?","a) JRE","b) JIT","c) JDK","d) JVM");
            Questions q4=new Questions("4. Which one of the following is not a Java feature?","a) Object-oriented","b) Use of pointers","c) Portable","d) Dynamic and Extensible");
            Questions q5=new Questions("5. Which of these cannot be used for a variable name in Java?","a) identifier & keyword","b) identifier","c) keyword","d) none of the mentioned");

            Map<Questions,Character>hmap=new HashMap<>();
            hmap.put(q1,'b');
            hmap.put(q2,'d');
            hmap.put(q3,'c');
            hmap.put(q4,'b');
            hmap.put(q5,'c');

            for (Map.Entry<Questions,Character> map:hmap.entrySet()){
                System.out.println(map.getKey().getQuestion());
                System.out.println(map.getKey().getOption1());
                System.out.println(map.getKey().getOption2());
                System.out.println(map.getKey().getOption3());
                System.out.println(map.getKey().getOption4());

                System.out.println("enter");
                Character ans=sc.next().charAt(0);
                int cans=Character.compare(ans,map.getValue());
                if (cans==0){
                    System.out.println("correct answer");
                    correctAnscount++;

                }
                else {
                    System.out.println("wrong answer");
                    wrongAnscount++;
                }
            }
            System.out.println("you have got : "+correctAnscount+"/"+hmap.size());



        }
    }

