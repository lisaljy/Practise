# Practise
Interesting Topic

* [Koch Snowflake](https://hihocoder.com/problemset/problem/1106)  

Koch Snowflake is one of the most famous factal. It is built by starting with an equilateral triangle, removing the inner third of each side, building another equilateral triangle at the location where the side was removed, and then repeating the process indefinitely.

Let Kn be the Koch Snowflake after n-th iteration. It is obvious that the number of sides of Kn, Nn, is 3*4n. Let's number the sides clockwisely from the top of Koch Snowflake.

Let si,n be the i-th side of Kn. The generation of si,n is defined as the smallest m satifying si,n is a part of the sides of Km. For example, in the above picture, the yellow sides are of generation 0; the blue sides are of generation 1; the red sides are of generation 2.

Given a side si,n, your task is to calculate its generation.

```  
  input=n;i  
  output = G(n,i)
```
