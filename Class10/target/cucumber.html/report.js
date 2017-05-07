$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittech/Documents/workspace/BTC009/Class10/login.feature");
formatter.feature({
  "line": 1,
  "name": "target login",
  "description": "",
  "id": "target-login",
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
  "name": "i navigate to target homePage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination_selim.i_open_browser(DataTable)"
});
formatter.result({
  "duration": 2566217377,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_selim.i_navigate_to_target_homePage()"
});
formatter.result({
  "duration": 1978389208,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "target-login;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "i click catagory button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination_selim.i_click_catagory_button()"
});
formatter.result({
  "duration": 378259961,
  "error_message": "org.openqa.selenium.InvalidSelectorException: Given xpath expression \"Scenario Outline: login validation\" is invalid: SyntaxError: The expression is not a legal expression.\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.3.0\u0027, revision: \u0027b526bd5b41\u0027, time: \u00272017-03-07 19:26:04 +0000\u0027\nSystem info: host: \u0027Bittechs-iMac.home\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/var/folders/9k/b6xx4tsn10q48n1zhk8vlk740000gn/T/rust_mozprofile.32ColHdekLpn, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, page load\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d52.0.1, platformVersion\u003d14.5.0, moz:processID\u003d12419, browserName\u003dfirefox, platformName\u003ddarwin}]\nSession ID: 9258f41f-47a1-1144-acb4-3244ba817129\n*** Element info: {Using\u003dxpath, value\u003dScenario Outline: login validation}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:604)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:476)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat com.selim.HomePage1.clickCatagory(HomePage1.java:29)\n\tat com.selim.StepDefination_selim.i_click_catagory_button(StepDefination_selim.java:59)\n\tat ✽.When i click catagory button(/Users/bittech/Documents/workspace/BTC009/Class10/login.feature:24)\n",
  "status": "failed"
});
});