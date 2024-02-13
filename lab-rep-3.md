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
