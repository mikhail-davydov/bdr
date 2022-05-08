import {Component} from "react";
import {AddCategoryForm} from "../add-category-form/AddCategoryForm";

import "./CategoriesTab.css";

export class CategoriesTab extends Component {

    render() {
        return (
            <div className="category-container">
                <AddCategoryForm/>
                <div className="category-content">
                    Here is the Category tab content
                </div>
            </div>
        );
    }


}