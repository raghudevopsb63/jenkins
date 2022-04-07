multibranchPipelineJob('example') {
  branchSources {
    git {
      id('123456789') // IMPORTANT: use a constant and unique identifier
      remote('https://github.com/raghudevopsb63/cart.git')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
}
