const gulp=require("gulp");

const task=gulp.task;

const less=require("gulp-less");
const del=require("del");
const path=require("path");


const pug = require('gulp-pug');

task('clean',function () {
    return del(['build']);

})
task('less',function () {
    return gulp.src('front/less/*.less').pipe(less()).pipe(gulp.dest(path.resolve(__dirname,'build','public','blog')));
})
task('pug',function () {
    return gulp.src('front/pug/*.pug').pipe(pug()).pipe(gulp.dest(path.resolve(__dirname,'build','public','blog')));
})
task('par',gulp.parallel('less','pug'))
task('ser',gulp.series('clean','par'))
