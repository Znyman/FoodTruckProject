# FoodTruckProject

## Description
The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array.
When a FoodTruck is created, its constructor assigns its id field the current value of a static field (nextTruckId), and then increments that static field in preparation of assigning the next truck's id.

If the user inputs quit for the food truck name, input ends immediately and the program continues.

After input is complete, the user sees a second menu from which they can choose to:

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.
Quit the program.

After a selected menu item finishes its action, the menu redisplays, allowing the user to select again, until the user selects the option to quit.
## Technologies Used
The program consists of multiple methods, most of which are void, but there is one that returns a double for the average rating of the food trucks, and one that returns a FoodTruck object itself for the highest rated food truck. Other simple logic was included in the program such as `if`, `for`, `while`, various private attribute declarations with setters and getters, a toString() method, print statements, and a Scanner.