# Functional interfaces
 - Java has types for evrything
 - For Functional programming type is Functional interface
 - java.util.function is the package for all these
# Function<T(Inoput Type),R(Return type)> is the base for all Functions
  - Based on Permutations and Combinations:
    - If T is empty then it will be a Producer
    - If R is Empty:void then it will be Consumer
    - If T ==R then it will be UnaryOperator
    - if T = R and T=boolean then it will be Predicate