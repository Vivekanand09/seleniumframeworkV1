#!/bin/bash
javadoc -docletpath target/seleniumframeworkV1-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet seleniumframeworkV1.seleniumframeworkV1.Doclet "$@"
