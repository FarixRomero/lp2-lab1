using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class frmMostrarPerfil : Form
    {
        public frmMostrarPerfil()
        {
            InitializeComponent();
        }

        private void btnModificarDatos_Click(object sender, EventArgs e)
        {
            frmModificarDatos modificarDatos = new frmModificarDatos();
            
            modificarDatos.ShowDialog();
            
        }

        private void btnModificarContra_Click(object sender, EventArgs e)
        {
            frmModificarContraseña actualizarContraseña = new frmModificarContraseña();
            actualizarContraseña.ShowDialog();

        }
    }
}
