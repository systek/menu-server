grails {
    mongo {
        host = "127.0.0.1"
        port = 27017
        databaseName = "foo"
    }
}

// environment specific settings
environments {
    development {
        mongo {
            host = "127.0.0.1"
            port = 27017
            databaseName = "foo"
        }
    }
    test {
        mongo {
            host = "localhost"
            port = 27017
            databaseName = "foo"
        }
    }
    production {
        mongo {
            host = "localhost"
            port = 27017
            databaseName = "foo"
        }
    }
}
