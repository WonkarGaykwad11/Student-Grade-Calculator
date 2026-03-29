# 🎓 Student Grade Calculator

A **Java-based Student Grade Calculator** that allows users to enter multiple subjects and their marks, then calculates the total marks, percentage, and assigns a grade based on performance.

---

## 🖼️ Sample Output

```
Welcome to Student's Grade Calculator

Enter the total number of subjects : 3

Enter the subject name along with their Marks

Enter the subject : Hindi
Enter the Obtained Marks : 89

Enter the subject : English
Enter the Obtained Marks : 78

Enter the subject : Marathi
Enter the Obtained Marks : 77

RESULT:-
Total marks : 244.0 out of 300
Total Percentage : 81.333336%
Based upon the score obtained grade is: A
```

---

## 📌 Features

* 📚 Accepts multiple subjects and marks
* ➕ Calculates total marks automatically
* 📊 Computes percentage accurately
* 🏆 Assigns grade based on performance
* 💻 Simple and user-friendly console interface

---

## 🛠 Technologies Used

* Java
* Scanner class (for user input)

---

## ▶️ How to Run

1. Open terminal / command prompt
2. Navigate to project folder
3. Compile the program:

   ```
   javac StudentGradeCalculator.java
   ```
4. Run the program:

   ```
   java StudentGradeCalculator
   ```

---

## 📊 Grading Criteria

| Percentage    | Grade |
| ------------- | ----- |
| 90% and above | A+    |
| 80% – 89%     | A     |
| 70% – 79%     | B     |
| 60% – 69%     | C     |
| Below 60%     | D     |

---

## 🧠 Logic Overview

* Take number of subjects as input
* Loop through each subject:

  * Take subject name
  * Take marks
* Calculate:

  * Total marks
  * Percentage = (Total / Maximum Marks) × 100
* Assign grade using conditional statements

---

## 📁 File Structure

* `StudentGradeCalculator.java` → Main program file

---

## 👨‍💻 Author

-Wonkar M. Gaykwad

---

## 🚀 Project Purpose

This project was developed as part of an internship task to demonstrate:

* Looping (for/while)
* Conditional statements (if-else)
* User input handling
* Basic arithmetic operations

---

## 🔥 Future Improvements

* Add input validation (invalid marks handling)
* Add grade remarks (Excellent, Good, Needs Improvement)
* Create GUI version using Java Swing
* Export result as report

---
