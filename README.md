# Peher

*An app that plays Indian classical music based on the time we are using it.*

## Setting up the application

#### Pre-requisites

* Lein - https://leiningen.org/#install
* Yarn - https://yarnpkg.com/en/docs/install


#### Steps to run application locally

* Clone the repo
* Run `yarn install` to install react, react-dom, webpack and other application dependencies
* Run `yarn webpack -w` to bundle js and css assets of the application
* Run `lein ring server` to start the server. This command will also install all dependencies and plugins when run for the first time.
