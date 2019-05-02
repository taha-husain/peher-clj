var path = require('path')

module.exports = {
  entry: './src/peher/assets/js/index.js',
  output: {
    path: path.resolve(__dirname, 'resources', 'public', 'js'),
    filename: 'bundle.js'
  },
  resolve: {
    extensions: ['*', '.js', '.jsx']
  },
  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        exclude: /node_modules/,
        use: ['babel-loader']
      }
    ]
  },
  mode: 'none'
}
