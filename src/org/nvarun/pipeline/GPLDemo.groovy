
package org.nvarun.pipeline

class GPLDemo implements Serializable {

  GPLDemo() {}

  def execute(origin) {

    origin.node {
      origin.stage('Initiate') {
        origin.sh 'echo Hello, World!'
      }
    }

  }

}
