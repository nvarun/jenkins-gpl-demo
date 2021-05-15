
package org.nvarun.pipeline

import org.nvarun.pipeline.certify.GPLCertifyDemo
import org.nvarun.pipeline.builder.GPLBuilderDemo
import org.nvarun.pipeline.publish.GPLPublishDemo

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

      new GPLCertifyDemo().execute(origin)
      new GPLBuilderDemo().execute(origin)
      new GPLPublishDemo().execute(origin)

    }

  }

}
