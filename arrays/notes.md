1. *Definition*:
   - Arrays in Java are a collection of elements of the same data type stored in contiguous memory locations under a single identifier.

2. *Declaration and Initialization*:
   - Declare an array: dataType[] arrayName;
   - Initialize an array: arrayName = new dataType[size];

3. *Accessing Elements*:
   - Individual elements are accessed using their index starting from 0: arrayName[index];

4. *Array Length*:
   - Length of the array can be obtained using arrayName.length.

5. *Initializing with Values*:
   - Arrays can be initialized with values during declaration:
     java
     int[] numbers = {1, 2, 3, 4, 5};
     
6. *Iterating through an Array*:
   - Use loops to traverse through array elements:
     java
     for (int i = 0; i < arrayName.length; i++) {
         // Access and process array elements using arrayName[i]
     }
     

7. *Multi-dimensional Arrays*:
   - Java supports multi-dimensional arrays:
     java
     dataType[][] arrayName = new dataType[rows][columns];
     

8. *Common Operations*:
   - Arrays support common operations like sorting, searching, copying, and filling, which can be performed using methods in the Arrays class.

9. *Array Bounds*:
   - Java arrays have fixed sizes once initialized, and accessing an index outside the array bounds results in an ArrayIndexOutOfBoundsException.
