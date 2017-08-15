# java8-demos
## Lambdas
   - Lambdas are syntax for the Functional programming in Java
   - Functional programming is separating data and behaviour
   - Functional programming is a new approach to the programming
   - With Lamdas ,Java is Now Object Oriented,Functional programming language
   - Lambdas are not part of the Compiler.They are interpretaed in the JVM/JRE
## Date TIME API
  - LocalDate
  - LocalTime
  - LocalDateTime
  - Duration
  - Period
  - ZoneIds
  -TemporalAdjusters
## Streams
  - Follows Map/Filter/Reduce Alogirthms
  - Stream is a declartion
  - Stream can be consumed only once
  - Map and Filter operations generate Intermediate Streams
  - Reduce does the comuting
## Optional Usage
  - Replace null with Optional.Empty;
	- Ex: Person p=null;
		 Person p=Optional.Empty
  - Ways to create Optional	
	- From Empty
		- Optional<String> myval=Optional.empty();
	- From Non Nullable 
		- Optional<String> myval = Optional.of("test");
	- From  Nullable 
		- Optional<Car> optCar = Optional.ofNullable(car);
  - Use Otopnal.isPresent to check the prescence of a value
  - Use orElse orElseThrow to deviate when empty value is there
