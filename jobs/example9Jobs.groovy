String basePath = 'example9'
String repo = ':pserver:anoncvs@example.org:/cvsroot'

folder(basePath) {
    description 'This example shows hwp to use automatically generated DSL provided by other plugins.'
}

job("$basePath/grails-legacy-build") {
    triggers {
        scm('H/5 * * * *')
    }
    steps {
    }
}
