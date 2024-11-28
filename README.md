# 🍔 Creating a Basic Kiosk Using Java

## 💻 Introduction
- The project is an assignment to assess whether students have understood the online lecture.
- Each of the five kiosks is developed as a personal project.
- All the kiosks are based on console user interfaces. 
  

## 📆 Development Period
- **Study**: 21/11/2024 – 24/11/2024
- **Development**: 21/11/2024 – 28/11/2024

## 🚀 Level

### 1️⃣ Level 1. MainLevelOne.java
- **Characteristics**
  - Number of classes defined in Java: 0
  - Created using procedural-oriented programming
- **Features** 
  - Displays the entire burger menu to the user including the name, cost, and a brief description
  - Informs the user of the selected menu item 
  - Exits the program if the user inputs zero or a number outside the menu index range
- **Usage**: Receives an integer from the user that corresponds to the menu item the user wants

### 2️⃣ Level 2. level2.package
- **Characteristics**
  - Number of classes defined in Java: 1
  - Class name: `MenuItem`
- **Features**
  - Displays the entire burger menu to the user including the name, cost, and a brief description
  - Informs the user of the selected menu item
    - The `MenuItem` class handles display and manages the list of menu items
  - Exits the program if the user inputs zero or a number outside the menu index range
- **Usage**: Receives an integer from the user that corresponds to the menu item the user wants

### 3️⃣ Level 3. level3.package
- **Characteristics**
  - Number of classes defined in Java: 2
  - Class names: `MenuItem`, `Kiosk` 
- **Features**
  - Displays the entire burger menu to the user including the name, cost, and a brief information 
  - Informs the user of the selected menu item
    - The `MenuItem` class manages the list of menu items
    - The `Kiosk` class handles input and display by using methods from the `MenuItem` class
    - All kiosk functions are included in the `start()` method of the `Kiosk` class 
  - Exits the program if the user inputs zero or a number outside the menu index range
- **Usage**: Receives an integer from the user that corresponds to the menu item the user wants

### 4️⃣ Level 4. level4.package
- **Characteristics**
  - Number of classes defined in Java: 3
  - Class names: `MenuItem`, `Kiosk`, `Menu` 
- **Features**
  - Displays the entire main menu to the user including the name—🍔Burgers, 🍹Drinks, and 🥗Sides
  - Displays the list of items within the selected category
  - Informs the user of the selected item, including its name, cost, and a brief description
    - The `MenuItem` class manages the list of menu items
    - The `Kiosk` class handles input and display to the user by using methods from the `Menu` class
    - The `Menu` class handles display of menu items by using methods from the `MenuItem` class
    - All kiosk functions are included in the `start()` method of the `Kiosk` class
  - Provides the option to return to the main menu
  - Exits the program if the user inputs zero or a number outside the menu index range
- **Usage**: Receives two integers from the user—one for the main menu index and the other for the item index

### 5️⃣ Level 5. level5.package
- **Characteristics**
  - Number of classes defined in Java: 3
  - Class names: `Kiosk`, `MenuItem`, `Menu` 
- **Features**
- Provides the same functions as level 4
- Includes private access modifiers, and getter and setter methods for better information security
- **Usage**: Receives two integers from the user—one for the main menu index and the other for the item index

## 📜 More Information
- [Visit Development Journal](https://writingforever162.tistory.com)
- [Visit Troubleshooting Records](https://writingforever162.tistory.com/category/Troubleshooting%3A%20%EB%AC%B4%EC%97%87%EC%9D%B4%20%EB%AC%B8%EC%A0%9C%EC%98%80%EB%8A%94%EA%B0%80%3F)

