# Lab Report 3
---
## ReverseInPlace Bug
### Failure-Inducing Output
```
public void testReverseInPlace2(){
    int[] input2 = {1,2,3,4};
    ArrayExamples.buggyReverseInPlace(input2);
    assertArrayEquals(new int[]{4,3,2,1}, input2);
}
```
### Non Failure-Inducing Output
```
public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.buggyReverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
}
```
### Symptom
![Image](symptom.png)

### Code Before Fix
```
for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
}
```
### Code After Fix
```
for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
}
```
The fix saves the data that is being replaced by the for loop. Since the data gets saved, it can now be used to replace the previous elements when reversing. 

## The `less` command:
### `-E` option: 
`less -E base-pair.txt`
`less -E 911report`
