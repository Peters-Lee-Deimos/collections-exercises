package grocery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class GroceryApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Groceries Online!");
        System.out.println("Are you ready to begin?");
        if (yesNo()){
            HashMap<String, HashMap<String, Groceries>> list = new HashMap<>();
            ArrayList<String> categories = new ArrayList<>();
            ArrayList<String> listedCategories = new ArrayList<>();
            ArrayList<String> sorting = new ArrayList<>();
            categories.add("Dairy");
            categories.add("Vegetables");
            categories.add("Fruit");
            categories.add("Meat");
            categories.add("Grains");
            categories.add("Fats");
            categories.add("Liquids");
            Collections.sort(categories);
            do {
                System.out.println("Would you like to see your current list?");
                if (yesNo()){
                    int viewChoice;
                    System.out.println("Which category to view?");
                    for (int i = 0; i < categories.size(); i++){
                        System.out.println(i + 1 + ". " + categories.get(i));
                    }
                    System.out.println("8. View All");
                    System.out.println("Enter here: ");
                    viewChoice = scanner.nextInt();
                    while (viewChoice < 1 || viewChoice > 8){
                        System.out.println("That is not a valid choice. Please enter again: ");
                        viewChoice = scanner.nextInt();
                    }
                    switch (viewChoice){
                        case 1:
                            if (list.get(categories.get(0)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(0)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(0) + " - Name: "
                                        + list.get(categories.get(0)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(0)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 2:
                            if (list.get(categories.get(1)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(1)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(1) + " - Name: "
                                        + list.get(categories.get(1)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(1)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 3:
                            if (list.get(categories.get(2)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(2)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(2) + " - Name: "
                                        + list.get(categories.get(2)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(2)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 4:
                            if (list.get(categories.get(3)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(3)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(3) + " - Name: "
                                        + list.get(categories.get(3)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(3)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 5:
                            if (list.get(categories.get(4)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(4)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(4) + " - Name: "
                                        + list.get(categories.get(4)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(4)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 6:
                            if (list.get(categories.get(5)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(5)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(5) + " - Name: "
                                        + list.get(categories.get(5)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(5)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 7:
                            if (list.get(categories.get(6)) == null){
                                System.out.println("This category is empty");
                                break;
                            }
                            for (String name : list.get(categories.get(6)).keySet()){
                                sorting.add(name);
                                Collections.sort(sorting);
                            }
                            for (String name : sorting){
                                System.out.println("Category: " + categories.get(6) + " - Name: "
                                        + list.get(categories.get(6)).get(name).getName() +
                                        " - Amount: " + list.get(categories.get(6)).get(name).getAmount());
                            }
                            sorting.clear();
                            break;
                        case 8:
                            listedCategories.clear();
                            listedCategories.addAll(list.keySet());
                            if (listedCategories.isEmpty()){
                                System.out.println("List is empty");
                                break;
                            }
                            Collections.sort(listedCategories);
                            for (String category : listedCategories){
                                for (String name : list.get(category).keySet()){
                                    sorting.add(name);
                                    Collections.sort(sorting);
                                }
                                for (String name : sorting){
                                    System.out.println("Category: " + category + " - Name: "
                                            + list.get(category).get(name).getName() +
                                            " - Amount: " + list.get(category).get(name).getAmount());
                                }
                                sorting.clear();
                            }
                            break;
                    }

                }
                System.out.println("Would you like to add a new item?");
                if (yesNo()){

                        int amount;
                        String name;
                        System.out.println("Here are the categories: ");
                        for (int i = 0; i < categories.size(); i++){
                            System.out.println(i + 1 + ". " + categories.get(i));
                        }
                        System.out.println("Enter the number of your category: ");
                        int choice = scanner.nextInt();
                        while (choice < 1 || choice > 7){
                            System.out.println("That is not a valid choice. Please enter again: ");
                            choice = scanner.nextInt();
                        }
                        switch (choice){
                            case 1:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(0)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(0), food);
                                }
                                if (already(list.get(categories.get(0)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(0) + " - Name: "
                                            + list.get(categories.get(0)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(0)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(0)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(0)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(0)).get(name).getName());
                                    System.out.println(list.get(categories.get(0)).get(name).getAmount());
                                }
                                break;
                            case 2:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(1)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(1), food);
                                }
                                if (already(list.get(categories.get(1)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(1) + " - Name: "
                                            + list.get(categories.get(1)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(1)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(1)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(1)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(1)).get(name).getName());
                                    System.out.println(list.get(categories.get(1)).get(name).getAmount());
                                }
                                break;
                            case 3:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(2)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(2), food);
                                }
                                if (already(list.get(categories.get(2)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(2) + " - Name: "
                                            + list.get(categories.get(2)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(2)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(2)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(2)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(2)).get(name).getName());
                                    System.out.println(list.get(categories.get(2)).get(name).getAmount());
                                }
                                break;
                            case 4:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(3)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(3), food);
                                }
                                if (already(list.get(categories.get(3)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(3) + " - Name: "
                                            + list.get(categories.get(3)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(3)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(3)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(3)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(3)).get(name).getName());
                                    System.out.println(list.get(categories.get(3)).get(name).getAmount());
                                }
                                break;
                            case 5:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(4)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(4), food);
                                }
                                if (already(list.get(categories.get(4)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(4) + " - Name: "
                                            + list.get(categories.get(4)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(4)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(4)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(4)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(4)).get(name).getName());
                                    System.out.println(list.get(categories.get(4)).get(name).getAmount());
                                }
                                break;
                            case 6:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(5)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(5), food);
                                }
                                if (already(list.get(categories.get(5)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(5) + " - Name: "
                                            + list.get(categories.get(5)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(5)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(5)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(5)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(5)).get(name).getName());
                                    System.out.println(list.get(categories.get(5)).get(name).getAmount());
                                }
                                break;
                            case 7:
                                System.out.println("Enter the name of your item:");
                                name = scanner.next();
                                name = name.toLowerCase();
                                System.out.println("Enter the amount of your item:");
                                amount = scanner.nextInt();
                                while (amount < 1){
                                    System.out.println("You need to enter a positive number.");
                                    amount = scanner.nextInt();
                                }
                                if (list.get(categories.get(6)) == null){
                                    HashMap<String, Groceries> food = new HashMap<>();
                                    list.put(categories.get(6), food);
                                }
                                if (already(list.get(categories.get(6)), name)){
                                    System.out.println("That item is already on the list.");
                                    System.out.println("Category: " + categories.get(6) + " - Name: "
                                            + list.get(categories.get(6)).get(name).getName() +
                                            " - Amount: " + list.get(categories.get(6)).get(name).getAmount());
                                    System.out.println("Do you want to edit the amount?");
                                    if (yesNo()){
                                        System.out.println("What is the new amount?");
                                        int replace = scanner.nextInt();
                                        while (replace < 1){
                                            System.out.println("You need to enter a positive number.");
                                            replace = scanner.nextInt();
                                        }
                                        list.get(categories.get(6)).get(name).changeAmount(replace);
                                        System.out.println("The amount was changed to " + replace);
                                    }
                                }
                                else {
                                    list.get(categories.get(6)).put(name, new Groceries(name, amount));
                                    System.out.println(list.get(categories.get(6)).get(name).getName());
                                    System.out.println(list.get(categories.get(6)).get(name).getAmount());
                                }
                                break;
                        }

                }

                System.out.println("Would you like to finalize the list?");
            } while (!yesNo());
            System.out.println("This is the finalized list: ");
            listedCategories.clear();
            listedCategories.addAll(list.keySet());
            Collections.sort(listedCategories);
            for (String category : listedCategories){
                for (String name : list.get(category).keySet()){
                    sorting.add(name);
                    Collections.sort(sorting);
                }
                for (String name : sorting){
                    System.out.println("Category: " + category + " - Name: "
                            + list.get(category).get(name).getName() +
                            " - Amount: " + list.get(category).get(name).getAmount());
                }
                sorting.clear();
            }
            System.out.println("\nWould you like to edit the list?");
            if (yesNo()){
                do {
                    String which;
                    String food;
                    System.out.println("Enter the category of the item to edit.");
                    which = scanner.next();
                    which = which.substring(0, 1).toUpperCase() + which.substring(1);
                    while (!categories.contains(which)){
                        System.out.println("You need to enter a correct category.");
                        which = scanner.next();
                        which = which.substring(0, 1).toUpperCase() + which.substring(1);
                    }
                    if (list.get(which) == null){
                        System.out.println("This category is empty");
                    }
                    else {
                        for (String name : list.get(which).keySet()) {
                            sorting.add(name);
                            Collections.sort(sorting);
                        }
                        for (String name : sorting) {
                            System.out.println("Category: " + which + " - Name: "
                                    + list.get(which).get(name).getName() +
                                    " - Amount: " + list.get(which).get(name).getAmount());
                        }
                    }
                    System.out.println("Which grocery do you want to edit?");
                    food = scanner.next();
                    while (!sorting.contains(food)){
                        System.out.println("You need to enter a correct grocery.");
                        food = scanner.next();
                    }
                    for (String name : sorting){
                        if (food.equalsIgnoreCase(name)){
                            System.out.println("Would you like to change amount?");
                            if (yesNo()){
                                System.out.println("What is the new amount?");
                                int replace = scanner.nextInt();
                                while (replace < 1){
                                    System.out.println("You need to enter a positive number.");
                                    replace = scanner.nextInt();
                                }
                                list.get(which).get(name).changeAmount(replace);
                                System.out.println("The amount was changed to " + replace);
                            }
                            else {
                                System.out.println("Would you like to remove this item?");
                                if (yesNo()){
                                    list.get(which).remove(name);
                                }
                            }
                        }
                    }
                    sorting.clear();
                    listedCategories.clear();
                    listedCategories.addAll(list.keySet());
                    Collections.sort(listedCategories);
                    for (String category : listedCategories){
                        for (String name : list.get(category).keySet()){
                            sorting.add(name);
                            Collections.sort(sorting);
                        }
                        for (String name : sorting){
                            System.out.println("Category: " + category + " - Name: "
                                    + list.get(category).get(name).getName() +
                                    " - Amount: " + list.get(category).get(name).getAmount());
                        }
                        sorting.clear();
                    }
                    System.out.println("\nWould you like to change anything else?");
                } while(yesNo());
            }

            System.out.println("Now ordering food...");
            System.out.println("Expect delivery in 5-10 business days");
        }
        else {
            System.out.println("Well, that's too bad...");
        }
    }

    public static boolean yesNo(){
        Scanner scanner = new Scanner(System.in);
        String check;
        System.out.println("Enter yes (or y) for yes:");
        check = scanner.next();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public static boolean already(HashMap<String, Groceries> grocery, String check){
        for (Groceries food : grocery.values()){
            if (check.equalsIgnoreCase(food.getName())){
                return true;
            }
        }
        return false;
    }


}
