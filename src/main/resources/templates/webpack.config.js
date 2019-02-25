const path = require('path')
const webpack = require('webpack')


let config = {
    entry: "./src/main.tsx",
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: "../../static/dist/main.js",
    },
    resolve: {
        extensions: ['.js', '.ts', '.tsx']
    },
    devtool: "source-map",
    module: {
        rules: [
            {
                test: /\.tsx?/,
                exclude: [/node_modules/],
                loader: 'tslint-loader',
                enforce: 'pre'
            },
            {
                test: /\.tsx?/,
                exclude: [/node_modules/],
                loader: 'ts-loader'
            }
        ]
    },
    plugins: [
        new webpack.DefinePlugin({
            'process.env' : {
                NODE_ENV: JSON.stringify(process.env.NODE_ENV)
            }
        })
    ]
};

module.exports = config;