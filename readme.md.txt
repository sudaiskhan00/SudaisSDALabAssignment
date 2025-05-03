# SudaisSDALabAssignment – Process Payment Use Case

## 🚀 How to Run the Project

1. **Requirements**:
   - Java JDK 8 or higher
   - IDE like IntelliJ or VSCode (or run via command line)

2. **Steps**:
   - Navigate to the `SudaisSDALabAssignment` folder.
   - Compile using:
     ```bash
     javac main/Main.java models/*.java services/*.java
     ```
   - Run:
     ```bash
     java main.Main
     ```

3. **Description**:
   - Calculates total fee with late fine.
   - Processes payment and updates status.
   - Sends notification to student.
   - Generates a fee voucher.

## 📂 Folder Structure

- `models/` – Student and Payment data models  
- `services/` – Business logic for processing payment  
- `main/` – Entry point
