$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to application",
  "description": "login and logout",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4196295168,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "login to the application",
  "description": "",
  "id": "login-to-application;login-to-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#And I enter the username as \"admin\" and password as \"admin\""
    }
  ],
  "line": 6,
  "name": "I enter the details",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 1131017281,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.iEnterTheDetails(DataTable)"
});
formatter.result({
  "duration": 163093661,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.iClickOnLoginButton()"
});
formatter.result({
  "duration": 72363746,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 319247750,
  "status": "passed"
});
formatter.after({
  "duration": 43860551,
  "status": "passed"
});
});