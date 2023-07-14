folder('JobDsl') {
    freeStyleJob('JobDsl/JobDsl_example') {
        scm {
            git {
                branch('main')
                remote {
                    url('https://github.com/Rahul-Palande11/Assignment7.git')
                }
            }
        }
        steps {
            dsl {
                external('JobDsl/*/folders.jenkins')
                external('JobDsl/**/*_job.jenkins')
            }
        }
    }
}
