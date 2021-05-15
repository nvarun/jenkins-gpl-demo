
package org.nvarun.pipeline

class GPLDemo implements Serializable {

  GPLDemo() {
    println 'Hello, World!'
  }

  def execute(origin) {

    origin.node {
      origin.stage('Initiate') {
        origin.sh '''
          set +xe
          echo Hello, World!
        '''
      }
    }

  }

}
