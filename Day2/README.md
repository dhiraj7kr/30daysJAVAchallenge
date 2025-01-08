Here are some practice problems for the array topics you've mentioned:

---

### **1. Array Basics**
**Question:**  
Write a program to input an array of integers and print its elements. Use both for-loop and enhanced for-loop.

---

### **2. Traversal**
**Question:**  
Given an array of integers, traverse the array and print only the even numbers.

---

### **3. Insertion**
**Question:**  
Write a program to insert a given element at a specific position in an array. Assume the array has enough space to accommodate the new element.

**Example Input:**  
Array: [1, 2, 3, 4, 5]  
Element to insert: 10  
Position: 2  

**Expected Output:**  
Array after insertion: [1, 10, 2, 3, 4, 5]

---

### **4. Deletion**
**Question:**  
Write a program to delete an element at a given index in an array.

**Example Input:**  
Array: [1, 2, 3, 4, 5]  
Index to delete: 3  

**Expected Output:**  
Array after deletion: [1, 2, 3, 5]

---

### **5. Reverse an Array**
**Question:**  
Write a program to reverse the elements of an array.

**Example Input:**  
Array: [1, 2, 3, 4, 5]  

**Expected Output:**  
Reversed Array: [5, 4, 3, 2, 1]

---

### **6. Find Minimum/Maximum**
**Question 1:**  
Write a program to find the minimum element in an array.  

**Example Input:**  
Array: [3, 5, 1, 9, 2]  

**Expected Output:**  
Minimum Element: 1  

**Question 2:**  
Write a program to find the maximum element in an array.  

**Example Input:**  
Array: [3, 5, 1, 9, 2]  

**Expected Output:**  
Maximum Element: 9  

---

### **7. Rotate Array**
**Question:**  
Write a program to rotate an array to the left by a given number of positions.

**Example Input:**  
Array: [1, 2, 3, 4, 5]  
Positions: 2  

**Expected Output:**  
Rotated Array: [3, 4, 5, 1, 2]  

---

### **8. Find Second Largest**
**Question:**  
Write a program to find the second largest element in an array.

**Example Input:**  
Array: [3, 5, 1, 9, 2]  

**Expected Output:**  
Second Largest Element: 5  

---

### **9. Frequency of Elements**
**Question:**  
Write a program to find the frequency of each element in an array.

**Example Input:**  
Array: [1, 2, 2, 3, 1, 4, 1]  

**Expected Output:**  
Frequency:  
1 -> 3 times  
2 -> 2 times  
3 -> 1 time  
4 -> 1 time  

---

### **10. Check Array is Palindrome**
**Question:**  
Write a program to check if an array is a palindrome (reads the same forward and backward).

**Example Input:**  
Array: [1, 2, 3, 2, 1]  

**Expected Output:**  

Here’s the code for each question mentioned:

---

### **1. Array Basics**
**Code:**
```java
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements using for-loop:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nArray elements using enhanced for-loop:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

---

### **2. Traversal**
**Code:**
```java
public class TraverseEvenNumbers {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};

        System.out.println("Even numbers in the array:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
```

---

### **3. Insertion**
**Code:**
```java
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0}; // Reserve space for one extra element
        int size = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position to insert at (0-based index): ");
        int position = scanner.nextInt();

        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
```

---

### **4. Deletion**
**Code:**
```java
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int size = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to delete (0-based index): ");
        int index = scanner.nextInt();

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
```

---

### **5. Reverse an Array**
**Code:**
```java
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
```

---

### **6. Find Minimum/Maximum**
**Code (Minimum):**
```java
public class FindMin {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum Element: " + min);
    }
}
```

**Code (Maximum):**
```java
public class FindMax {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}
```

---

### **7. Rotate Array**
**Code:**
```java
public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 2;

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nRotated Array:");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[(i + positions) % n] + " ");
        }
    }
}
```

---

### **8. Find Second Largest**
**Code:**
```java
public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}
```

---

### **9. Frequency of Elements**
**Code:**
```java
import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 1, 4, 1};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " -> " + frequencyMap.get(key) + " times");
        }
    }
}
```

---

### **10. Check Array is Palindrome**
**Code:**
```java
public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
```

Let me know if you'd like explanations or further assistance! 😊
The array is a palindrome.

---

Let me know if you'd like solutions for any of these problems! 😊
