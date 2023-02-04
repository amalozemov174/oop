package com.gb.view;

import com.gb.command.Command;
import com.gb.command.FamilyTreeCommand;
import com.gb.relation.Human;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class View {

    public View() {

    }

    public void getStartWork(){
        System.out.println("Вас приветствует программа по работе с семейным древом");
    }

    public void getAllComand(List<Command> commands) {
        System.out.println("Выберите команду для работы с семейным древом");
        for (Command command : commands) {
            System.out.println(command.getName() + " " + command.getDescription());
        }
    }

    public void getAllFamilyTreeMembers(FamilyTreeCommand command) {
        System.out.println("Все члены семьи");
        System.out.println(command.getFamilyMembers());
    }

    public void addHumanToTree(BufferedReader bufferedReader, FamilyTreeCommand familyTreeCommand) throws IOException {
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

    public void notRecognizedCommand() {
        System.out.println("Повторите команду");
    }


}
