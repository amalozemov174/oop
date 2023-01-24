package com.gb;

import com.gb.command.CommandToTree;
import com.gb.command.FamilyTreeCommand;
import com.gb.comparator.HumanComparatorByDate;
import com.gb.relation.Human;
import com.gb.relation.Relatives;
import com.gb.tree.FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class App {


        public static void main(String[] args) throws IOException, ClassNotFoundException {
            FamilyTree familyTree = new FamilyTree();
            FamilyTreeCommand familyTreeCommand = new FamilyTreeCommand(familyTree);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String command = "";
            System.out.println("Вас приветствует программа по работе с семейным древом");
            while (!command.equals("exit")) {
                System.out.println("Выберите команду для работы с семейным древом");
                System.out.println("a - добавить члена семьи");
                System.out.println("l - показать семейное древо");
                System.out.println("exit - выйти из программы");
                command = bufferedReader.readLine();
                if(command.equals(CommandToTree.Create.getName())){
                    System.out.println("введите параметры человека в формате:");
                    System.out.println("пол male/female");
                    boolean male = bufferedReader.readLine().equals("male");
                    System.out.println("имя");
                    String name = bufferedReader.readLine();
                    System.out.println("Фамилия");
                    String surname = bufferedReader.readLine();
                    System.out.println("Дата рождения(год-месяц-день)");
                    String date = bufferedReader.readLine();
                    String format[] = date.split("-");
                    Date d = new Date(Integer.parseInt(format[0]), Integer.parseInt(format[1]),Integer.parseInt(format[2]));
                    System.out.println("Извесны ли родители?(да/нет)");
                    String parents = bufferedReader.readLine();
                    if(parents.equals("да")){
                        System.out.println("Введите имя и фамилию 1го родителя(имя фамилия)");
                        String parent1 = bufferedReader.readLine();
                        String[] par1 = parent1.split(" ");
                        Human h1 = familyTreeCommand.getFamilyMemberByNameAndSurname(par1[0], par1[1]);
                        System.out.println("Введите имя и фамилию 2го родителя(имя фамилия)");
                        String parent2 = bufferedReader.readLine();
                        String[] par2 = parent1.split(" ");
                        Human h2 = familyTreeCommand.getFamilyMemberByNameAndSurname(par2[0], par2[1]);
                        Human h = new Human(h1, h2, male, name, surname, d);
                        System.out.println("Добавлен член семьи");
                        System.out.println(h);
                        familyTreeCommand.addFamilyMember(h);
                    }
                    else {
                        Human h = new Human(male, name, surname, d);
                        System.out.println("Добавлен член семьи");
                        System.out.println(h);
                        familyTreeCommand.addFamilyMember(h);
                    }
                }
                else if(command.equals(CommandToTree.List.getName())){
                    System.out.println("Все члены семьи");
                    System.out.println(familyTreeCommand.getFamilyMembers());
                }
                else {
                    System.out.println("Повторите программу");
                }

            }

//            Human pert = new Human(true, "Petr", "Petrov", new Date(40, 12, 12));
//            Human evgenia = new Human(false, "Evgenia", "Petrova", new Date(41, 12, 12));
//            Human nadegda = new Human(evgenia, pert, false, "Nadegda", "Ivanova", new Date(80, 12, 12));
//            Human olga = new Human(evgenia, pert, false, "Olga", "Ivanova", new Date(90, 12, 12));
//            Human vika = new Human(evgenia, pert, false, "Vika", "Ivanova", new Date(92, 12, 12));
//            Human luba = new Human(evgenia, pert, false, "Luba", "Ivanova", new Date(93, 12, 12));
//            Human julia = new Human(evgenia, pert, false, "Julia", "Ivanova", new Date(94, 12, 12));
//
//            familyTree.addFamilyMember(pert);
//            familyTree.addFamilyMember(evgenia);
//            familyTree.addFamilyMember(nadegda);
//            familyTree.addFamilyMember(olga);

            //evgenia.setChildren(olga);
            //evgenia.setChildren(nadegda);
            // System.out.println(evgenia);
//            Relatives relatives = new Relatives(evgenia);
//            System.out.println(relatives.getChildrens());
            // System.out.println("evgenia: " + relatives.getChildrens());

            //Serializable
//        FileHandler.write("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt", evgenia);
//        Human h = FileHandler.read("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt");
//        System.out.println(h);
//        Relatives relativesRestored = new Relatives(h);
//        System.out.println("Restored: " + h.getChildrens());

            //Iterator
//        for (Human human : familyTree) {
//            System.err.println(human.getChildrens());
//        }
            //Comparator
//            System.out.println(familyTree.getFamilyTree());
//            HumanComparatorByDate humanComparatorByDate = new HumanComparatorByDate();
//            familyTree.sortByDate(humanComparatorByDate);
//            System.out.println(familyTree.getFamilyTree());
        }

    }
