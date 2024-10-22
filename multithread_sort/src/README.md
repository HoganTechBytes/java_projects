# Multithreaded Merge Sort

This project implements a Multithreaded Merge Sort algorithm in Java. The project demonstrates how multithreading can significantly improve sorting performance on large datasets, such as an array of 1 million elements. The sorting algorithm leverages Java's ForkJoinPool to run merge sort in parallel, allowing multiple parts of the array to be sorted simultaneously.
Features

    - Parallel Sorting: Utilizes multithreading to divide and conquer the sorting process, resulting in faster performance for large datasets.
    - Merge Sort Algorithm: A classic divide-and-conquer sorting algorithm that is efficiently parallelized.
    - Scalable: The program is capable of handling arrays with 1 million or more elements, and the performance benefits of multithreading increase as the array size grows.
    - Benchmarking: The program measures and displays the time taken to sort an array of 1 million elements both in milliseconds and seconds.

## How It Works

    - The array is recursively divided into smaller subarrays.
    - Each half of the array is sorted by separate threads using Java's ForkJoinPool.
    - Once the subarrays are sorted, they are merged back together.
    - The process continues until the entire array is sorted.

## Performance

The performance of the multithreaded merge sort is compared with a single-threaded merge sort to demonstrate the benefits of parallel execution, especially with larger datasets. The array size is set to 1 million elements to illustrate the efficiency gains.
