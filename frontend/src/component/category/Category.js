import {Component} from "react";
import {CategoryForm} from "../category-form/CategoryForm";

import "./Category.css";

export class Category extends Component {

    render() {
        return (
            <div className="category-container">
                <CategoryForm/>
                <div className="category-content">
                    Here is the category content
                </div>
            </div>
        );
    }


}