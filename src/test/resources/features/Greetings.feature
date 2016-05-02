Feature: Greetings
  06:00 - 08:59 Good morning, World!
  09:00 - 18:59 Good day, World!
  19:00 - 22:59 Good evening, World!
  23:00 - 05:59 Good night, World!

  Scenario Outline: Greetings in the day
    Given time of the day: "<time>"
    When program run
    Then we have "<greeting message>"
    Examples:
      | time  | greeting message     |
      | 06:00 | Good morning, World! |
      | 09:00 | Good day, World!     |
      | 19:00 | Good evening, World! |
      | 23:00 | Good night, World!   |
      | 08:59 | Good morning, World! |
      | 18:59 | Good day, World!     |
      | 22:59 | Good evening, World! |
      | 05:59 | Good night, World!   |


