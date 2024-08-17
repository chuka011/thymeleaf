
Standard expressions in Thymeleaf:
- ${...} - variable expression
- *{...} - selection expression (with previously defined th:object="${...}")
- #{...} - messsage expression (prop file and i18n)
- @{...} - link expression
- ~{...} - fragment expression

Attributes in Thymeleaf:
- th:text - evaluate expression and replace text in tag body 
- th:each - iterate over List, Set, Map, Array (status variable in iteration, provided by Thymeleaf)
- th:if, th:unless - conditions attributes