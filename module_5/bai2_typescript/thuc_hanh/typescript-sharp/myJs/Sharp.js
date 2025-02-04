"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Sharp = void 0;
class Sharp {
    constructor(x, y) {
        this._x = x;
        this._y = y;
    }
    get x() {
        return this._x;
    }
    set x(value) {
        this._x = value;
    }
    get y() {
        return this._y;
    }
    set y(value) {
        this._y = value;
    }
    toString() {
        return `(x: ${this._x}, y: ${this._y})`;
    }
}
exports.Sharp = Sharp;
