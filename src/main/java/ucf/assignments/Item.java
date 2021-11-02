package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.*;
import javafx.scene.control.CheckBox;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

//This will deal with the items that are inside the multiple do-do lists that will be made
public class Item {

//We will create a constructor to hold the description and the date that the user sets and it will also deal with its
    //due date

    public Item(String description, LocalDate setDueDate){

        //The constructors job is to help create a checkbox so we can know the status of each item whether it is
        //completed or not
    }
    public int getStatus(){

        //Will allow us to know the status of each current item and it will be either complete or incomplete
        return -1;
    }

    public int getDescription(){
        //This method is responsible for getting the description of an item
        //We will utulize the function variable.get()

        return -1;
    }

    public void setDescription(String destination){

        //We will use the simple string property for the description
        //This method will also use this.variable to store and assign the description assigned from the parameter
    }

    public LocalDate getDate(){

        //we will be returning the date
    }

    public setDate(LocalDate setTime){

        //This will be user based and will set the due date of the current item to the users choice.
    }


}
