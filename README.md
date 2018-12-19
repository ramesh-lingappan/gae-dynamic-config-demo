# Securing Secrets with Google Cloud KMS Demo

Sample demo application for securing secrets of different environments using Cloud KMS. Its a basic appengine java web application.

Based on the Medium article [Dynamic AppEngine Configurations using Gradle](https://medium.com/@rameshlingappa/dynamic-appengine-configurations-using-gradle-part-1-e3959a39f31b)


## How to read ?

- Refer [build.gradle](build.gradle) file to understand how tasks are setup for Encrypt, decrypt and deployment
- Refer [google_kms.gradle](google_kms.gradle) file understand helper methods for Google Cloud KMS service 

- [credentials](credentials) folder is added to github just for the purpose of demo , in realworld this folder is added to gitignore
- [credentials-enc](credentials-enc) folder contains the encrypted secret files for each environment 





