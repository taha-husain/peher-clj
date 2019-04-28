var path = require('path')

module.exports = {
  entry: './src/peher/assets/js/index.js',
  output: {
    path: path.resolve(__dirname, 'resources', 'public', 'js'),
    filename: 'bundle.js'
  }
}
