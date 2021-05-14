
package org.nvarun.pipeline

class GPLDemo implements Serializable {

  GPLDemo() {}

  def execute(origin) {

    origin.node {
      println 'Hello, World!'
    }

  }

}
