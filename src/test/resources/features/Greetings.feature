Feature: Greetings
  06:00 - 08:59 Good morning, World!
  09:00 - 18:59 Good day, World!
  19:00 - 22:59 Good evening, World!
  23:00 - 05:59 Good night, World!

  06:00 - 08:59 Доброе утро, Мир!
  09:00 - 18:59 Добрый день, Мир!
  19:00 - 22:59 Добрый вечер, Мир!
  23:00 - 05:59 Доброй ночи, Мир!

  Scenario Outline: Greetings in the day
    Given time of the day: "<time>"
    And set language: "<language>"
    When program run
    Then we have "<greeting message>"
    Examples:
      | time  | greeting message     | language |
      | 06:00 | Good morning, World! | en       |
      | 09:00 | Good day, World!     | en       |
      | 19:00 | Good evening, World! | en       |
      | 23:00 | Good night, World!   | en       |
      | 08:59 | Good morning, World! | en       |
      | 18:59 | Good day, World!     | en       |
      | 22:59 | Good evening, World! | en       |
      | 05:59 | Good night, World!   | en       |
      | 06:00 | Доброе утро, Мир!    | ru       |
      | 09:00 | Добрый день, Мир!    | ru       |
      | 19:00 | Добрый вечер, Мир!   | ru       |
      | 23:00 | Доброй ночи, Мир!    | ru       |
      | 08:59 | Доброе утро, Мир!    | ru       |
      | 18:59 | Добрый день, Мир!    | ru       |
      | 22:59 | Добрый вечер, Мир!   | ru       |
      | 05:59 | Доброй ночи, Мир!    | ru       |


