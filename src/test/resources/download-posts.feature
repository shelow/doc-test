Feature: downloading and return firsts posts
  We want to download post from an external service, sort them and return limited number of them

  Background:
    Given following posts when downloading succeeded
    | id  | userId | title       | body          |
    | 1   | 1      | My title 10 | My post body  |
    | 2   | 1      | My title 5  | My post body  |
    | 3   | 2      | My title 9  | My post body  |
    | 4   | 2      | My title 11 | My post body  |
    | 5   | 3      | My title 12 | My post body  |
    | 6   | 1      | My title 7  | My post body  |

  Scenario: Download and return N firsts sorted posts
    Given wanted 3 first posts
    When trying to download all posts from jsonplaceholder and return limited elements
    And the downloading "success"
    Then return following elements
      | id  | userId | title       | body          |
      | 2   | 1      | My title 5  | My post body  |
      | 6   | 1      | My title 7  | My post body  |
      | 3   | 2      | My title 9  | My post body  |

  Scenario: Wanted posts is greater than number of received posts
    Given wanted 10 first posts
    When trying to download all posts from jsonplaceholder and return limited elements
    And the downloading "success"
    Then return following elements
      | id  | userId | title       | body          |
      | 2   | 1      | My title 5  | My post body  |
      | 6   | 1      | My title 7  | My post body  |
      | 3   | 2      | My title 9  | My post body  |
      | 1   | 1      | My title 10 | My post body  |
      | 4   | 2      | My title 11 | My post body  |
      | 5   | 3      | My title 12 | My post body  |

  Scenario: Download fail
    Given wanted 50 first posts
    When trying to download all posts from jsonplaceholder and return limited elements
    And the downloading "fail"
    Then return error : loading failure

