# 🧰 Library Manager System

This project represents a comprehensive Java-based system that integrates multiple core software development concepts:

- Data Retrieval
- Sorting & Searching
- User Interaction via Menus
- Logging & Tracking
- Serialization & Persistence

📁 Repository Structure

```
JavaDataEngine/
├── data/                      # Input files (e.g., books.txt)
├── logs/                      # Logs of user interactions
├── saved/                     # Serialized library data
├── src/                       # Source code directory
│   ├── Book.java              # Book model
│   ├── Library.java           # Core logic: data loading, searching
│   ├── SortUtil.java          # Sorting utilities (bubble sort)
│   ├── LibraryMenu.java       # Text-based menu logic
│   ├── UserLogger.java        # User interaction logger
│   ├── LibrarySerializer.java # Object persistence handler
│   └── Main.java              # Application entry point
└── README.md                  # Project documentation
```



## 🔍 Project Overview

This project simulates a mini information retrieval engine, integrating:

- Reading and parsing structured data from text files
- Organizing data with custom sorting algorithms
- Allowing efficient search through user input
- Providing a clean text-based user interface
- Tracking and logging all user actions
- Saving and restoring application state using serialization

## 🎯 Project Goals

By the end of this project, you will have developed a system that supports:

✅ Data Loading: Read book records from a file and populate Java objects.  
✅ Sorting: Organize the collection by title, author, or year using bubble sort.  
✅ Search: Locate books by title, author, or year using case-insensitive search.  
✅ User Interaction: Navigate the system via a console-based interface.  
✅ Logging: Log every user action to a file for tracking/debugging.  
✅ Persistence: Save/load system state using serialization.

## 🔧 Technologies Used

- Java SE 8+
- Object-Oriented Programming
- File I/O (BufferedReader, Scanner, etc.)
- Custom Sorting (Bubble Sort)
- Search Logic (Linear Search)
- Serialization (ObjectInputStream, ObjectOutputStream)
- Console-based Menus
- Logging with Timestamps

## 🚀 How to Run

1. Compile all classes:
2. Run the application:
3. Follow the console menu to:
- View all books
- Sort data
- Search for a book
- Save/load the library
- Exit and log actions

## ✅ Grading Criteria (Coursera Final Assessment)

| Task ID | Task Description                                       | Status       |
|---------|--------------------------------------------------------|--------------|
| TODO 1  | Load data from file and populate list                  | ✅ Completed |
| TODO 2  | Implement sorting algorithm                            | ✅ Completed |
| TODO 3  | Create flexible search function                        | ✅ Completed |
| TODO 4  | Build text-based user interface                        | ✅ Completed |
| TODO 5  | Log all user interactions                              | ✅ Completed |
| TODO 6  | Serialize and deserialize the system state             | ✅ Completed |

