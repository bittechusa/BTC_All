$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittech/Documents/workspace/BTC009/Class10/facebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "facebook login validation",
  "description": "",
  "id": "facebook-login-validation",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open browser",
  "rows": [
    {
      "cells": [
        "firefox"
      ],
      "line": 5
    },
    {
      "cells": [
        "chrome"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i nevigate to facebook homePage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_open_browser(DataTable)"
});
formatter.result({
  "duration": 2397233823,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_nevigate_to_facebook_homePage()"
});
formatter.result({
  "duration": 1660868160,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "successfull login",
  "description": "",
  "id": "facebook-login-validation;successfull-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "i type valid email in userIDBox",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "i type valid password in passwordBox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i click on logIn button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i should be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_type_valid_email_in_userIDBox()"
});
formatter.result({
  "duration": 76789553,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_type_valid_password_in_passwordBox()"
});
formatter.result({
  "duration": 44621944,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_click_on_logIn_button()"
});
formatter.result({
  "duration": 50421334,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #u_0_u\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.0\u0027, revision: \u0027b526bd5b41\u0027, time: \u00272017-03-07 19:26:04 +0000\u0027\nSystem info: host: \u0027Bittechs-iMac.home\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/var/folders/9k/b6xx4tsn10q48n1zhk8vlk740000gn/T/rust_mozprofile.qEn6sawgbZLF, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, page load\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d52.0.1, platformVersion\u003d14.5.0, moz:processID\u003d14501, browserName\u003dfirefox, platformName\u003ddarwin}]\nSession ID: 5727b2f4-c369-7645-8551-4323e8ae3fd2\n*** Element info: {Using\u003did, value\u003du_0_u}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:604)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat com.selim.HomePage1.click(HomePage1.java:53)\n\tat bdd.secondClass.StepDefination.i_click_on_logIn_button(StepDefination.java:43)\n\tat ✽.And i click on logIn button(/Users/bittech/Documents/workspace/BTC009/Class10/facebookLogin.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.i_should_be_on_my_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "invalid  login scenario",
  "description": "",
  "id": "facebook-login-validation;invalid--login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "i type invalid email in \"\u003cuserIDBox\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "i type invalid password in \"\u003cpasswordBox\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i click on logIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should not be on my profile page",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "facebook-login-validation;invalid--login-scenario;",
  "rows": [
    {
      "cells": [
        "userIDBox",
        "passwordBox"
      ],
      "line": 28,
      "id": "facebook-login-validation;invalid--login-scenario;;1"
    },
    {
      "cells": [
        "shahid",
        "a1233432543"
      ],
      "line": 29,
      "id": "facebook-login-validation;invalid--login-scenario;;2"
    },
    {
      "cells": [
        "fdzfsdaf",
        "a1234"
      ],
      "line": 30,
      "id": "facebook-login-validation;invalid--login-scenario;;3"
    },
    {
      "cells": [
        "dfsjdfh",
        "sdfgusdjgf"
      ],
      "line": 31,
      "id": "facebook-login-validation;invalid--login-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open browser",
  "rows": [
    {
      "cells": [
        "firefox"
      ],
      "line": 5
    },
    {
      "cells": [
        "chrome"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i nevigate to facebook homePage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_open_browser(DataTable)"
});
formatter.result({
  "duration": 1899883670,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_nevigate_to_facebook_homePage()"
});
formatter.result({
  "duration": 910211785,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "invalid  login scenario",
  "description": "",
  "id": "facebook-login-validation;invalid--login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "i type invalid email in \"shahid\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "i type invalid password in \"a1233432543\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i click on logIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should not be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shahid",
      "offset": 25
    }
  ],
  "location": "StepDefination.i_type_invalid_email_in(String)"
});
formatter.result({
  "duration": 59289760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a1233432543",
      "offset": 28
    }
  ],
  "location": "StepDefination.i_type_invalid_password_in(String)"
});
formatter.result({
  "duration": 64245101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_click_on_logIn_button()"
});
formatter.result({
  "duration": 37613964,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_should_not_be_on_my_profile_page()"
});
formatter.result({
  "duration": 105022909,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open browser",
  "rows": [
    {
      "cells": [
        "firefox"
      ],
      "line": 5
    },
    {
      "cells": [
        "chrome"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i nevigate to facebook homePage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_open_browser(DataTable)"
});
formatter.result({
  "duration": 1972098728,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_nevigate_to_facebook_homePage()"
});
formatter.result({
  "duration": 878838336,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "invalid  login scenario",
  "description": "",
  "id": "facebook-login-validation;invalid--login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "i type invalid email in \"fdzfsdaf\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "i type invalid password in \"a1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i click on logIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should not be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "fdzfsdaf",
      "offset": 25
    }
  ],
  "location": "StepDefination.i_type_invalid_email_in(String)"
});
formatter.result({
  "duration": 64568448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a1234",
      "offset": 28
    }
  ],
  "location": "StepDefination.i_type_invalid_password_in(String)"
});
formatter.result({
  "duration": 54268591,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_click_on_logIn_button()"
});
formatter.result({
  "duration": 60295318,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_should_not_be_on_my_profile_page()"
});
formatter.result({
  "duration": 93181920,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open browser",
  "rows": [
    {
      "cells": [
        "firefox"
      ],
      "line": 5
    },
    {
      "cells": [
        "chrome"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i nevigate to facebook homePage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_open_browser(DataTable)"
});
formatter.result({
  "duration": 2007457352,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_nevigate_to_facebook_homePage()"
});
formatter.result({
  "duration": 1292404217,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "invalid  login scenario",
  "description": "",
  "id": "facebook-login-validation;invalid--login-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "i type invalid email in \"dfsjdfh\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "i type invalid password in \"sdfgusdjgf\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i click on logIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should not be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dfsjdfh",
      "offset": 25
    }
  ],
  "location": "StepDefination.i_type_invalid_email_in(String)"
});
formatter.result({
  "duration": 55783710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdfgusdjgf",
      "offset": 28
    }
  ],
  "location": "StepDefination.i_type_invalid_password_in(String)"
});
formatter.result({
  "duration": 45898511,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_click_on_logIn_button()"
});
formatter.result({
  "duration": 15005843,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: \nBuild info: version: \u00273.3.0\u0027, revision: \u0027b526bd5b41\u0027, time: \u00272017-03-07 19:26:04 +0000\u0027\nSystem info: host: \u0027Bittechs-iMac.home\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/var/folders/9k/b6xx4tsn10q48n1zhk8vlk740000gn/T/rust_mozprofile.dC8LeGCQY2Bm, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, page load\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d52.0.1, platformVersion\u003d14.5.0, moz:processID\u003d14513, browserName\u003dfirefox, platformName\u003ddarwin}]\nSession ID: f675c9e9-5b75-8c4d-90c6-df19c6bb1253\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:604)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat com.selim.HomePage1.click(HomePage1.java:53)\n\tat bdd.secondClass.StepDefination.i_click_on_logIn_button(StepDefination.java:43)\n\tat ✽.And i click on logIn button(/Users/bittech/Documents/workspace/BTC009/Class10/facebookLogin.feature:23)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.i_should_not_be_on_my_profile_page()"
});
formatter.result({
  "status": "skipped"
});
});