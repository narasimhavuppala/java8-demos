# java8-demos
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
	-Ex: Person p=null;
		 Person p=Optional.Empty
  - Use Optional.of to construct Optional
  - Use Otopnal.isPresent to check the prescence of a value
  - Use orElse orElseThrow to deviate when empty value is there
