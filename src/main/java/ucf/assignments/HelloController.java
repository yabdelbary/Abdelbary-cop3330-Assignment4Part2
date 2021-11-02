package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

//To start we created a class so we can use it to control what we will be doing with the to-do list
//This will allow the manipulation of the GUI to take place for the Application
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to your to-do list!");
    }


    //We will create a ListOfLists class which will provide a list of the to-do lists that are in the program
    public int listOfLists(){
    //We will insert a case to make sure that there is indeed a list present



}

    public int findList(String listName) {

       //Going to have to go down the listOflists to find the list you would like
        //So creating a simple for loop that runs through listOfLists
        return -1;
    }




    public int removeList() {
        //Same thing with the findList function we have to find the right index in listOfLists corresponding to the list
        //Except now we will also add a remove method to remove the list from listOfLists index
        return -1;
    }




    public String addListItem(String listItem) {
        //We have to create a new list before adding it to the listOfLists indexes
        //Then we would simply add the new list using listOfLists.add("")

        return "";//NEw list item that is given
    }



    public int removeListItem(String listName, String listItem){
        //In order for this to happen we have to go in and find the list we would like to remove from
        //Then we can remove the item from the list we do not wish to be there
        return -1;
    }

    public String editListTitle(String name, String newTitleName){
        //We would find the index of the list
        //Then we would set the old list to the new list title
        //Once we return the new title name we can see whether it updated

        return ""; //new list title that is given
    }

    public String editListItemDueDate(String listName, String listItem, String newDueDate){
        //We would first start with finding the list name
        //Then we will access the item and finally change the due date
        return""; //new updated DueDate we changed it too
    }

    public String editListitemDescription(String listName, String listItem, String newDescription){
        //Same thing like the itemDueDate we would first find the list name and get to that index
        //Next with the right index we can change the item Description with the name of the item

        return ""; //new updated Description we changed it too
    }


        public String displayListAllItems(String listName){
            //In order for us to display list items we would need to first get to the list we need
            //Then we would traverse through all the indexes of said list

        return ""; //Will display all the items in said list.
        }

    public String displayListIncompletedElements(String listName){
        //in order to find "Incompleted Elements" we would first find the list we're using
        //then utilize the method listOfLists[].displayIncompletedElements();

        return ""; //Display the "incompleted elements" in said list.
    }

    public String displayListCompletedElements(String listName){
        //In order to find 'Completed Elements' We would first find the list we're using
        //Then utilize the method listOfLists[].displayCompletedElements();

        return ""; //Elements that are completed in said list.
    }

    public String saveAllLists(){
        //In order to save the lists we would start by scanning in the lists
        //then we would have to make a nested for loop to go through all the lists and the items inside the lists
        //Then we would write it in and output file with all the lists and the items that are inside

       return "";
    }

    public String listSaveLists(){
        //Find the list by calling the list name
        //Then save whatever index you wanted to save
        return "";
    }

    public String listLoadSingleList(){
        //To start off we need to scan in using the scanner function
        //Once we scan in we need to go throguh and parse the file and put it into a new list
        //after we do this we would return this newList we created

        return "";
    }

    public String listLoadMultipleList(){
        //similar to the single list we start off by using the scanner function to scan in
        //Once we scan in we will go through and parse the file aswell
        //Except now we will make sure to go through and grab more than one list
        return "";
    }
}