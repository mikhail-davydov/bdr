import {Component} from "react";
import {AddCompanyForm} from "../add-company-form/AddCompanyForm";

import "./CompaniesSettings.css";

export class CompaniesSettings extends Component {

    render() {
        return (
            <div className="companies-settings-container">
                <AddCompanyForm/>
                <div className="companies-settings-content">
                    Here is the Companies Settings content
                </div>
            </div>
        );
    }

}