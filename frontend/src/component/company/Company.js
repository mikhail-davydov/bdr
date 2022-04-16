import {Component} from "react";

import "../chevron/Chevron.css";
import "./Company.css";

class Company extends Component {

    render() {
        let visibleCompany = this.props.companies.find(company => company.isVisible);
        let companyClassName = this.getCompanyClassName();
        let companyTextClassName = this.getCompanyTextClassName();
        return (
            <div className="company-container" onClick={this.props.onClick}>
                <div className={companyClassName}>
                    <div className={companyTextClassName}>
                        {visibleCompany.name}
                    </div>
                </div>
            </div>
        )
    }

    getCompanyTextClassName() {
        if (this.props.companies.length === 1) {
            return "company__text";
        }

        return this.props.chevronUp ?
            "company__text chevron chevron-up" :
            "company__text chevron chevron-down";
    }

    getCompanyClassName() {
        return "company";
    }

}

export default Company;