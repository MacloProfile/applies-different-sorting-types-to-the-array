package com.mcl.typesofsorts.logic.features;

public class InformationAboutMethod {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;


    public void setDescription(String method) {
        if (method.equals("Linear Search")) {
            field1 = "Iterate through each element in the collection from start to end.";
            field2 = "Compare each element with the target value until a match is found or the end of the collection is reached.";
            field3 = "If a match is found, return the index of the element; otherwise, return a signal value indicating that the element was not found.";
            field4 = "Linear search has a time complexity of O(n), where n is the number of elements in the collection.";
            field5 = "";
        } else if (method.equals("Binary Search (only sorted)")) {
            field1 = "Compare the target value with the middle element of the collection.";
            field2 = "If the target value matches the middle element, the search is successful.";
            field3 = "If the target value is less than the average item, search again in the left half of the collection. Otherwise, in the right half.";
            field4 = "Continue dividing the collection in half until the target value is found or the search range becomes empty.";
            field5 = "Binary search has a time complexity of O(log n), where n is the number of elements in the collection.";
        } else if (method.equals("Bubble Sort")) {
            field1 = "Compare adjacent elements in the collection and swap them if they are in the wrong order.";
            field2 = "Repeat this process for each pair of adjacent elements, gradually moving from the beginning to the end of the collection.";
            field3 = "Repeat the above steps until the entire collection is sorted, with the largest elements 'bubbling' to the end in each iteration.";
            field4 = "Bubble sort has a time complexity of O(n^2), where n is the number of elements in the collection.";
            field5 = "";
        } else if (method.equals("Insertion Sort")) {
            field1 = "Maintain a sorted and unsorted region within the collection.";
            field2 = "Iterate through the unsorted region, comparing and shifting elements in the sorted region to make room for the element.";
            field3 = "Insert the current element into the correct position in the sorted region.";
            field4 = "Repeat the above steps until the entire collection is sorted.";
            field5 = "Insertion sort has a time complexity of O(n^2), but it performs well on small collections or partially sorted collections.";
        } else if (method.equals("Merge Sort")) {
            field1 = "Recursively divide the collection into two halves until each sub-collection contains only one element.";
            field2 = "Merge sorted sub-collections by comparing and placing elements in the correct order in a temporary array.";
            field3 = "Repeat the merging process until the entire collection is sorted.";
            field4 = "Merge sort has a time complexity of O(n log n), making it efficient for large collections.";
            field5 = "";
        } else if (method.equals("Quick Sort")) {
            field1 = "Select a pivot element from the collection.";
            field2 = "Partition the collection into two sub-collections: elements less than the pivot and elements greater than the pivot.";
            field3 = "Recursively apply the quick sort algorithm to the sub-collections.";
            field4 = "Combine the sorted sub-collections with the pivot element to obtain the final sorted collection.";
            field5 = "Quick sort has an average time complexity of O(n log n), but its worst-case time complexity is O(n^2).";
        } else if (method.equals("Selection Sort")) {
            field1 = "Iterate through the collection and select the minimum element.";
            field2 = "Swap the selected minimum element with the first unsorted element.";
            field3 = "Move the boundary between the sorted and unsorted portions of the collection to the right.";
            field4 = "Repeat the process for the remaining unsorted portion until the entire collection is sorted.";
            field5 = "Selection sort has a time complexity of O(n^2) in all cases, making it less efficient for large datasets.";
        }
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public String getField4() {
        return field4;
    }

    public String getField5() {
        return field5;
    }
}
