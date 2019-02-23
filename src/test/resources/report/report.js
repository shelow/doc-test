$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("download-posts.feature");
formatter.feature({
  "line": 1,
  "name": "downloading and return firsts posts",
  "description": "We want to download post from an external service, sort them and return limited number of them",
  "id": "downloading-and-return-firsts-posts",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "following posts when downloading succeeded",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 6
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 7
    },
    {
      "cells": [
        "2",
        "1",
        "My title 5",
        "My post body"
      ],
      "line": 8
    },
    {
      "cells": [
        "3",
        "2",
        "My title 9",
        "My post body"
      ],
      "line": 9
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 10
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 11
    },
    {
      "cells": [
        "6",
        "1",
        "My title 7",
        "My post body"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DownloadSteps.java:31"
});
formatter.result({
  "duration": 132974459,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Download and return N firsts sorted posts",
  "description": "",
  "id": "downloading-and-return-firsts-posts;download-and-return-n-firsts-sorted-posts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "wanted 3 first posts",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "trying to download all posts from jsonplaceholder and return limited elements",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the downloading \"success\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "return following elements",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 19
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 20
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 21
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 7
    }
  ],
  "location": "DownloadSteps.java:38"
});
formatter.result({
  "duration": 907766,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:40"
});
formatter.result({
  "duration": 388119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 17
    }
  ],
  "location": "DownloadSteps.java:45"
});
formatter.result({
  "duration": 17926484,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:66"
});
formatter.result({
  "duration": 2276258,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "following posts when downloading succeeded",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 6
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 7
    },
    {
      "cells": [
        "2",
        "1",
        "My title 5",
        "My post body"
      ],
      "line": 8
    },
    {
      "cells": [
        "3",
        "2",
        "My title 9",
        "My post body"
      ],
      "line": 9
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 10
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 11
    },
    {
      "cells": [
        "6",
        "1",
        "My title 7",
        "My post body"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DownloadSteps.java:31"
});
formatter.result({
  "duration": 147113,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Wanted posts is greater than number of received posts",
  "description": "",
  "id": "downloading-and-return-firsts-posts;wanted-posts-is-greater-than-number-of-received-posts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "wanted 10 first posts",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "trying to download all posts from jsonplaceholder and return limited elements",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the downloading \"success\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "return following elements",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 29
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 30
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 31
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 32
    },
    {
      "cells": [
        "2",
        "1",
        "My title 5",
        "My post body"
      ],
      "line": 33
    },
    {
      "cells": [
        "6",
        "1",
        "My title 7",
        "My post body"
      ],
      "line": 34
    },
    {
      "cells": [
        "3",
        "2",
        "My title 9",
        "My post body"
      ],
      "line": 35
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    }
  ],
  "location": "DownloadSteps.java:38"
});
formatter.result({
  "duration": 101497,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:40"
});
formatter.result({
  "duration": 26990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 17
    }
  ],
  "location": "DownloadSteps.java:45"
});
formatter.result({
  "duration": 105678,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:66"
});
formatter.result({
  "duration": 155096,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "following posts when downloading succeeded",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 6
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 7
    },
    {
      "cells": [
        "2",
        "1",
        "My title 5",
        "My post body"
      ],
      "line": 8
    },
    {
      "cells": [
        "3",
        "2",
        "My title 9",
        "My post body"
      ],
      "line": 9
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 10
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 11
    },
    {
      "cells": [
        "6",
        "1",
        "My title 7",
        "My post body"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DownloadSteps.java:31"
});
formatter.result({
  "duration": 109480,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Download fail",
  "description": "",
  "id": "downloading-and-return-firsts-posts;download-fail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "wanted 50 first posts",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "trying to download all posts from jsonplaceholder and return limited elements",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the downloading \"fail\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "return error : loading failure",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 7
    }
  ],
  "location": "DownloadSteps.java:38"
});
formatter.result({
  "duration": 82870,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:40"
});
formatter.result({
  "duration": 32691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fail",
      "offset": 17
    }
  ],
  "location": "DownloadSteps.java:45"
});
formatter.result({
  "duration": 1736845,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:74"
});
formatter.result({
  "duration": 52458,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "following posts when downloading succeeded",
  "rows": [
    {
      "cells": [
        "id",
        "userId",
        "title",
        "body"
      ],
      "line": 6
    },
    {
      "cells": [
        "1",
        "1",
        "My title 10",
        "My post body"
      ],
      "line": 7
    },
    {
      "cells": [
        "2",
        "1",
        "My title 5",
        "My post body"
      ],
      "line": 8
    },
    {
      "cells": [
        "3",
        "2",
        "My title 9",
        "My post body"
      ],
      "line": 9
    },
    {
      "cells": [
        "4",
        "2",
        "My title 11",
        "My post body"
      ],
      "line": 10
    },
    {
      "cells": [
        "5",
        "3",
        "My title 12",
        "My post body"
      ],
      "line": 11
    },
    {
      "cells": [
        "6",
        "1",
        "My title 7",
        "My post body"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DownloadSteps.java:31"
});
formatter.result({
  "duration": 94654,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Download empty list of posts",
  "description": "",
  "id": "downloading-and-return-firsts-posts;download-empty-list-of-posts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "wanted 50 first posts",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "the downloading has empty result",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "return error : not found",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 7
    }
  ],
  "location": "DownloadSteps.java:38"
});
formatter.result({
  "duration": 80209,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:56"
});
formatter.result({
  "duration": 641671,
  "status": "passed"
});
formatter.match({
  "location": "DownloadSteps.java:61"
});
formatter.result({
  "duration": 48657,
  "status": "passed"
});
});