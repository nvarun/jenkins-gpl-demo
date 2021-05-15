
package org.nvarun.pipeline

class GPLDemo implements Serializable {

  GPLDemo() {}

  def execute(origin) {

    node {
      stage('Initiate') {
        sh 'echo Hello, World!'
      }
    }

  }

}
