import {Component} from "react";
import {AddCategoryForm} from "../category-form/AddCategoryForm";

import "./Category.css";

export class Category extends Component {

    render() {
        return (
            <div className="category-container">
                <AddCategoryForm/>
                <div className="category-content">
                    Here is the category content
                </div>
            </div>
        );
    }


}